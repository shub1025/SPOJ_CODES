import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

//import turri.OnotoleNeedsYourHelp.FastReader;
//import turri.OnotoleNeedsYourHelp.Print;

 class CardGame {

	 	static class Print{
	 		  BufferedWriter bw;
	 		public Print(){
	 			this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
	 		}
	 		public void print(Object object) throws IOException{
	 			//this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
	 		bw.write(String.valueOf(object));
	 		bw.flush();
	 		}
	 		public void println(Object object) throws IOException{
	 			//this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
	 		bw.write(String.valueOf(object)+"\n");
	 		bw.flush();
	 		}
	 		public void close() throws IOException{
	 			bw.close();
	 		}
	 	}	
	 	
	 static class FastReader
	 {
	 BufferedReader br;
	 StringTokenizer st;

	 public FastReader()
	 {
	     br = new BufferedReader(new
	              InputStreamReader(System.in));
	 }

	 String next()
	 {
	     while (st == null || !st.hasMoreElements())
	     {
	         try
	         {
	             st = new StringTokenizer(br.readLine());
	         }
	         catch (IOException  e)
	         {
	             e.printStackTrace();
	         }
	     }
	     return st.nextToken();
	 }

	 int nextInt()
	 {
	     return Integer.parseInt(next());
	 }

	 long nextLong()
	 {
	     return Long.parseLong(next());
	 }
	 String nextLine()
	 {
	     String str = "";
	     try
	     {
	         str = br.readLine();
	     }
	     catch (IOException e)
	     {
	         e.printStackTrace();
	     }
	     return str;
	 }
	 }

	 public static void main(String[] args) throws IOException
	 {
		 FastReader scan=new FastReader();
	     Print p=new Print();
		 //Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 while(n!=0)
		 {
			 int i=0;
			 if(n==1)
				 System.out.println("1");
			 else
			 {
			 while(Math.pow(2, i)<n)
			 {
			 i++;}
			 long a = (long) Math.pow(2, i-1);
			 long ans = (n-a)*2;
			 p.println(ans);
			 }
			 n = scan.nextInt();
		 }
	 }
}
