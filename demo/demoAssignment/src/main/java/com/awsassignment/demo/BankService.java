package com.awsassignment.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.stereotype.Service;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Event;
import com.amazonaws.services.s3.model.S3Object;
@Service
public class BankService extends SpringBootRequestHandler<S3Event ,String>{
	@Autowired
	private BankRepository bankrepo;
	public void handleRequest(Bank bank,Context context) {
		AmazonS3 amazons3=AmazonS3ClientBuilder.standard().build();
		S3Object s=amazons3.getObject("bankapplicationbuckets","Demo.csv");
		System.out.println(s);
		BufferedReader ib=new BufferedReader(new InputStreamReader(s.getObjectContent()));
		String line=null; 
		try {
			ib.readLine();
			while((line=ib.readLine())!=null) { 
				String [] data=line.split(","); 
				String a=data[0];
				String b=data[1];
				String c=data[2];		
			bank.setCustomerID(Integer.parseInt(a));
			bank.setBranchID(Integer.parseInt(b));
			bank.setAccountID(Integer.parseInt(c));
			System.out.println(bank);
			List<Bank> banklist=new ArrayList<>();
			banklist.add(bank);
			Iterable<Bank> result=bankrepo.saveAll(banklist);
			result.forEach(Bank->{
				System.out.println(Bank);
			});
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
