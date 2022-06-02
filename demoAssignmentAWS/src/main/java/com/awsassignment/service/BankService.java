package com.awsassignment.service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Object;
import com.awsassignment.dao.BankDao;
import com.awsassignment.pojo.Bank;
@Component
public class BankService implements RequestHandler<Bank ,String>{
	private  BankDao bankdao;
	private AmazonS3 amazons3;
	private Bank bank;
	public BankService() {

	}
	public BankDao getBankdao() {
		return bankdao;
	}

	@Autowired
	public BankService(BankDao bankdao) {
		this.bankdao = bankdao;
	}

	public BankService(AmazonS3 amazons3) {
		this.amazons3 = amazons3;
	}
	@Override
	public String handleRequest(Bank input, Context context) {
		List<Bank> banklist=amazons3client();
		ListIterator<Bank> li=banklist.listIterator();
		while(li.hasNext()) {
			bankdao.saveBankdatails(li.next());
		}
		return "successful";
	}
	public List<Bank> amazons3client() {
		amazons3 = AmazonS3ClientBuilder.standard().build();
		S3Object s=amazons3.getObject("bankapplicationbuckets","Demo.csv");
		BufferedReader ib=new BufferedReader(new InputStreamReader(s.getObjectContent()));
		List<Bank> banklist=new ArrayList<>();
		String line=null; 
		try {
			ib.readLine();
			while((line=ib.readLine())!=null) { 
				String [] data=line.split(","); 
				for(int i=0;i<data.length;i++){
					int branch=Integer.parseInt(data[0]);
					int account=Integer.parseInt(data[1]);
					bank=new Bank(branch,account);
				}
				banklist.add(bank);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return banklist;
	}
}
