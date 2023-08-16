package _1200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1204 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int a = Integer.parseInt(br.readLine());
    String result = null;

    if(a==1 || a%10==1) {
      if(a==11) {
        result = "th";
      }else {
        result = "st";
      }
    }else if(a==2 || a%10==2) {
      if(a==12) {
        result = "th";
      }else {
        result = "nd";
      }
    }else if(a==3 || a%10==3) {
      if(a==13) {
        result = "th";
      }else {
        result = "rd";
      }
    }else {
      result = "th";			
    }

    bw.write(String.valueOf(a)+result);

    bw.flush();
    bw.close();
    br.close();
  }
}
