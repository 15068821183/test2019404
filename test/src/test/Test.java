package test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;

public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		Address address1 = new Address("�й�", "�㽭");
		User user1 = new User(10, "С��", address1);
		Address address2 = new Address("�й�", "�㽭");
		User user2 = new User(10, "С��", address2);
		System.out.println(new String(objectToByteArray(user1),"utf-8"));
		System.out.println(new String(objectToByteArray(user2),"utf-8"));
		
	}
	public static byte[] objectToByteArray(Object obj){
		if (obj == null) {
			return null;
		}
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			(new ObjectOutputStream(bos)).writeObject(obj);
			
			return bos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}

