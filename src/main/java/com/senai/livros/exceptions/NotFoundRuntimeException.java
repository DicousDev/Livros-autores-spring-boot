package com.senai.livros.exceptions;

public class NotFoundRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 7433473891607295557L;
	
	public NotFoundRuntimeException(String mensagem) {
		super(mensagem);
	}
}
