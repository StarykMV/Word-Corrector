package app;

public class Corrector {
    public String handleData(String[] strs){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;

        for (String str : strs) {
            if(str.contains("b")) {
                str = str.replace("b", "o");
            }

            stringBuilder.append(str).append(") ").append(str).append("\n");
            count++;
        }

        return stringBuilder.toString();
    }
}
