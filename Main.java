import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    parser p = new parser(new Yylex(new InputStreamReader(System.in)));
    p.parse();
  }
}
