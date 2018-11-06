package io.provider;

import org.apache.servicecomb.provider.pojo.RpcSchema;

@RpcSchema(schemaId = "compute")
public class ComputeImp implements Compute {

	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int Reducing(int num1, int num2) {
		
		return num1-num2;
	}

	@Override
	public int Multiplication(int num1, int num2) {
		
		return num1*num2;
	}

	@Override
	public int Division(int num1, int num2) {
		
		return num1/num2;
	}

}
