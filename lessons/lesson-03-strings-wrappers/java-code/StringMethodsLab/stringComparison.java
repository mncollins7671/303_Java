package StringMethodsLab;

public class stringComparison {
    static void main(String[] args) {
        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
    }

    public static void usingEquals(String[] args){
        String s1="Perscholas";
        String s2="Perscholas";
        String s3= "Perscholas";
        System.out.println(s1 == s2);//true (because both refer to same instance)
        System.out.println(s1 == s3);//false(because s3 refers to instance created in nonpool)
    }

    public static void compareTo(String[] args){
        String s1="Perscholas";
        String s2="Perscholas";
        String s3="Perschola";
        String s4="PerscholasX";
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
        System.out.println(s1.compareTo(s4)); // -1(because s1<s4 )
    }

}
