import java.io.*;

class Nuke2 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int c = reader.read();
		reader.read();
		String out_put = ""+(char)c;

		while((c=reader.read()) != 13) {			
			out_put += (char)c;
		}

		System.out.println(out_put);
	}
}