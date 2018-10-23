/*
변수 할당 및 연관 확인
*/

class JAVA
{
	// st 변수가 제대로 연관할당되는지 확인
	public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
	{
	  String data;
	
	  StringTokenizer st = new StringTokenizer(request.getQueryString(), "&");
	  while (st.hasMoreTokens())
	  {
	    String token = st.nextToken(); 
	    if (token.startsWith("id="))  
	    {
	      data = token.substring(3); 
	      break;
	    }
	  }
	
	  if (data != null) {
	      response.getWriter().println("<br>bad(): data = " + data);
	  }
	}

	// ioe 변수 연관 확인
	void mmm(int n1)
	{
		try {
			File outFile = null;
		} 
		catch (IOException ioe) {  System.err.println(System.err.toString());  ioe.printStackTrace(System.err);}   /// 한줄에서 ioe 변수가 연결안됨.
	}

	void m2m()
	{
		int n=1;
		n++;
	}

	void m2m(  )
	{
		int n=1;
		n++;
	}
}

// ioe, e 변수 연관 확인
class JAVA2
{
	void mmm (int n1)
	{
		File outFile;

		try {
			outFile = null;
		} 
		catch (IOException ioe)
		{
			system.out.println("dddd : " + outFile.toString());
			try{
			}
			catch(Exception e){			/// 중첩된 catch 문에서 e 변수 연결안됨
				e.printStackTrace();
			}

			System.err.println(System.err.toString());
			ioe.printStackTrace(System.err);
		}
		catch (Exception e) {
			System.err.println(System.err.toString());
			e.printStackTrace(System.err);
		}
	}

}
