import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<String> planuri = new ArrayList<>();
//        planuri.add("05:30 desteptarea");
//        planuri.add("gimnastica");
//        planuri.add("job");
//        planuri.add("magzin");
//        planuri.add("vizita");
//        planuri.add("22:00 culcare");
//        planuri.add("job");
//        planuri.size();
//        for (String planu : planuri)
//
//        System.out.println(planuri);
//    }
      //  =======================================================================

//        Set<String> obecte = new HashSet<>();
//        obecte.add("Scaun");
//        obecte.add("lampa");
//        obecte.add("masa");
//        obecte.add("dulap");
//        obecte.add("pat");
//        obecte.add("carte");
//        obecte.add("masa");
//        obecte.add("tv");
//        System.out.println(obecte);

    //    =========================================================

        Map<String,String> dictionar = new HashMap();
        dictionar.put("table","masa");
        dictionar.put("chair","scaun");
        dictionar.put("bag","gianta");
        dictionar.put("shoes","papuci");
        dictionar.put("sun","soare");
        dictionar.put("walk","merge");
        dictionar.put("run","fuge");
        dictionar.put("speak","vorbeste");
        dictionar.put("drink","bea");
        dictionar.put("drive","conduce");

        for (Map.Entry<String,String>entry : dictionar.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());


        }
    }
}