/*
���� �Ҵ� �� ���� Ȯ��
*/

class JAVA
{
	// st ������ ����� �����Ҵ�Ǵ��� Ȯ��
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

	// ioe ���� ���� Ȯ��
	void mmm(int n1)
	{
		try {
			File outFile = null;
		} 
		catch (IOException ioe) {  System.err.println(System.err.toString());  ioe.printStackTrace(System.err);}   /// ���ٿ��� ioe ������ ����ȵ�.
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

// ioe, e ���� ���� Ȯ��
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
			catch(Exception e){			/// ��ø�� catch ������ e ���� ����ȵ�
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
