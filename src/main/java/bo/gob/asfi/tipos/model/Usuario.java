package bo.gob.asfi.tipos.model;

import java.util.Date;

/**
 * Created by fernando on 10/12/16.
 */
public class Usuario
{
	private String name;

	private String address;

	private Date birthDate;

	private Double saldo;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public Date getBirthDate()
	{
		return birthDate;
	}

	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}

	public Double getSaldo()
	{
		return saldo;
	}

	public void setSaldo(Double saldo)
	{
		this.saldo = saldo;
	}

	public Usuario(String name)
	{
		this.name = name;
		this.address = "address of " + name;
		this.birthDate = new Date();
		this.saldo = 0.0;
	}

	public Usuario()
	{
		this.name = null;
		this.address = null;
		this.birthDate = null;
		this.saldo = null;
	}

}

