package collection;

class VarArgs {

    public static void main(String[] args) {
        System.out.println(concetinate("kartik"));
        System.out.println(concetinate("kartik","gupta"));
        System.out.println(concetinate("Subscribe"," hustler"));
    }
    public static String concetinate(String... strs){
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
