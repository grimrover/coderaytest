/*
�������Ϳ����� - ���׸�(���ø�) ó��
*/

class Gen <T>
{
	public T m_strTest1=null;
	public T m_strTest2 = null;
	public T[] m_strTest3 = null;
	public T m_strTest4[];
	
	void bad()
	{
		String str1, str2, str3=null,str4,str5=null;
		String sta1[], sta2[],sta3[]=null, sta4[]=null, sta5[];
		String[] stb1, stb2=null, stb3=null, stb4, stb5=null;
		String[] strc1 = new String[10];
		
		sta4 = new String[3];
		stb4 = new String[3];
		
		stb4[0] = "abc";
		stb4[1] = "def";
		stb4[2] = "ghi";
		
		sta4[0] = stb4[0];
		sta4[1] = stb4[1];
		sta4[2] = stb4[2];
			
		System.out.println("GetT " + str3.length());		// str3(����) �����, str3 �������� ���� Ȯ��
		System.out.println("GetT " + str4.length());		// str4(����) ������ƴ�, str4 �������� ���� Ȯ��
		System.out.println("GetT " + str5.length());		// str5(����) �����, str5 �������� ���� Ȯ��
		System.out.println("GetT " + sta3[0].length());		// sta3(����) �����, sta3 �������� ���� Ȯ��
		System.out.println("GetT " + sta4[0].length());		// sta4(����) �����, sta4 �������� ���� Ȯ��
		System.out.println("GetT " + sta5[0].length());		// sta5(����) ������ƴ�, sta5 �������� ���� Ȯ��
		System.out.println("GetT " + stb3[0].length());		// stb3(����) �����, stb3 �������� ���� Ȯ��
		System.out.println("GetT " + stb4[0].length());		// stb4(����) ������ƴ�, stb4 �������� ���� Ȯ��
		System.out.println("GetT " + stb5[0].length());		// stb5(����) �����, stb5 �������� ���� Ȯ��
	}
}

class Gun<T1, T2>
{
	public T1 m_strTest1=null;
	public T2 m_strTest2=null;
}

class Tom 
{
	public void bad() 
	{
		String strTemp1, strTemp2;

		strTemp1 = new String();
		String strTemp3 = new String();
		
		Gen<String> gGen1 = new Gen<String>();
		System.out.println("Gen1 : " + gGen1.m_strTest1.length());		// m_strTest1(���) �����, m_strTest1 ������� ���� Ȯ��
		System.out.println("Gen1 : " + gGen1.m_strTest2.length());		// m_strTest2(���) �����, m_strTest2 ������� ���� Ȯ��
		gGen1.m_strTest3 = new String[10];
		System.out.println("Gen1 : " + gGen1.m_strTest3[0].length());	// m_strTest3(���) �����, m_strTest3 ������� ���� Ȯ��	
		gGen1.m_strTest4 = new String[10];
		System.out.println("Gen1 : " + gGen1.m_strTest4[0].length());	// m_strTest4(���) �����, m_strTest4 ������� ���� Ȯ��

		Gen<Object> gGen2 = new Gen<Object>();
		System.out.println("Gen2 : " + gGen2.m_strTest1.toString());	// m_strTest1(���) �����, m_strTest1 ������� ���� Ȯ��
		System.out.println("Gen2 : " + gGen2.m_strTest2.toString());	// m_strTest2(���) �����, m_strTest2 ������� ���� Ȯ��
		gGen2.m_strTest3 = new Object[10];
		System.out.println("Gen2 : " + gGen2.m_strTest3[0].toString());	// m_strTest3(���) �����, m_strTest3 ������� ���� Ȯ��
		gGen2.m_strTest4 = new Object[10];
		System.out.println("Gen2 : " + gGen2.m_strTest4[0].toString());	// m_strTest4(���) �����, m_strTest4 ������� ���� Ȯ��
		
		Gun<String,Object> gGun1 = new Gun<String,Object>();
		System.out.println("Gen2 : " + gGun1.m_strTest1.length());		// m_strTest1(���) �����, m_strTest1 ������� ���� Ȯ��
		System.out.println("Gen2 : " + gGun1.m_strTest2.toString());	// m_strTest2(���) �����, m_strTest2 ������� ���� Ȯ��
	}
}

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("Hello World !!");
	}
}