/*
널포인터역참조 - 제네릭(템플릿) 처리
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
			
		System.out.println("GetT " + str3.length());		// str3(지역) 취약점, str3 지역변수 연결 확인
		System.out.println("GetT " + str4.length());		// str4(지역) 취약점아님, str4 지역변수 연결 확인
		System.out.println("GetT " + str5.length());		// str5(지역) 취약점, str5 지역변수 연결 확인
		System.out.println("GetT " + sta3[0].length());		// sta3(지역) 취약점, sta3 지역변수 연결 확인
		System.out.println("GetT " + sta4[0].length());		// sta4(지역) 취약점, sta4 지역변수 연결 확인
		System.out.println("GetT " + sta5[0].length());		// sta5(지역) 취약점아님, sta5 지역변수 연결 확인
		System.out.println("GetT " + stb3[0].length());		// stb3(지역) 취약점, stb3 지역변수 연결 확인
		System.out.println("GetT " + stb4[0].length());		// stb4(지역) 취약점아님, stb4 지역변수 연결 확인
		System.out.println("GetT " + stb5[0].length());		// stb5(지역) 취약점, stb5 지역변수 연결 확인
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
		System.out.println("Gen1 : " + gGen1.m_strTest1.length());		// m_strTest1(멤버) 취약점, m_strTest1 멤버변수 연결 확인
		System.out.println("Gen1 : " + gGen1.m_strTest2.length());		// m_strTest2(멤버) 취약점, m_strTest2 멤버변수 연결 확인
		gGen1.m_strTest3 = new String[10];
		System.out.println("Gen1 : " + gGen1.m_strTest3[0].length());	// m_strTest3(멤버) 취약점, m_strTest3 멤버변수 연결 확인	
		gGen1.m_strTest4 = new String[10];
		System.out.println("Gen1 : " + gGen1.m_strTest4[0].length());	// m_strTest4(멤버) 취약점, m_strTest4 멤버변수 연결 확인

		Gen<Object> gGen2 = new Gen<Object>();
		System.out.println("Gen2 : " + gGen2.m_strTest1.toString());	// m_strTest1(멤버) 취약점, m_strTest1 멤버변수 연결 확인
		System.out.println("Gen2 : " + gGen2.m_strTest2.toString());	// m_strTest2(멤버) 취약점, m_strTest2 멤버변수 연결 확인
		gGen2.m_strTest3 = new Object[10];
		System.out.println("Gen2 : " + gGen2.m_strTest3[0].toString());	// m_strTest3(멤버) 취약점, m_strTest3 멤버변수 연결 확인
		gGen2.m_strTest4 = new Object[10];
		System.out.println("Gen2 : " + gGen2.m_strTest4[0].toString());	// m_strTest4(멤버) 취약점, m_strTest4 멤버변수 연결 확인
		
		Gun<String,Object> gGun1 = new Gun<String,Object>();
		System.out.println("Gen2 : " + gGun1.m_strTest1.length());		// m_strTest1(멤버) 취약점, m_strTest1 멤버변수 연결 확인
		System.out.println("Gen2 : " + gGun1.m_strTest2.toString());	// m_strTest2(멤버) 취약점, m_strTest2 멤버변수 연결 확인
	}
}

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("Hello World !!");
	}
}