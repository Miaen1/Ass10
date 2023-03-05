public class App {
    public static void main(String[] args) throws Exception {
        String st="miaen!Ma";
        System.out.println(st);
        System.out.println(CheckPass(st));
        
    }
    public static boolean CheckPass( String st){
        char [] c= st.toCharArray();
        boolean aa=false,bb=false,cc=false,dd=false,check=false;
        
        for( int i=0; i<st.length();i++){
            if(c[i]>='a'&&c[i]<='z'){
                aa=true;
                //System.out.println("a"+aa);
            }
            if(c[i]>='A'&& c[i]<='Z'){
                bb=true;
               // System.out.println("b"+bb);
            }
            if(c[i]>='0'&& c[i]<='9'){
                cc=true;
               // System.out.println("c"+cc);
            }
            //~!@#$%^&*()-=+_
            if(c[i]=='~'|| c[i]=='!'||c[i]=='@'||c[i]=='#'||c[i]=='$'||c[i]=='%'||c[i]=='^'||c[i]=='&'||c[i]=='*'||c[i]=='('||c[i]==')'||c[i]=='-'||c[i]=='='||c[i]=='+'||c[i]=='_'){
                dd=true;
                //System.out.println("d"+dd);
            }
            if(aa&&bb&&cc||aa&&bb&&dd||bb&&cc&&dd||aa&&cc&&dd){
                check=true;
            }
            if (check&& st.length()>=8&&st.length()<=16){
                return true;
            }
        }
        return false;

    }
}
