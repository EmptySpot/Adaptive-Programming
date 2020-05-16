package FinalAssignment2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FSMTekst {

    public static List run(Node node, List inp, List ans) {
        ans.add(node.getName());
        Collection value = node.getDictio().values();
        List theValList = new ArrayList(value);
        Collection keys = node.getDictio().keySet();
        List theKeyList = new ArrayList(keys);
        if (inp.size() != 0) {
            String firstItem = (String) inp.get(0);
            int i = 0;
            int location = -1;
            while (i < theKeyList.size()) {
                String tester = String.valueOf(theKeyList.get(i));
                if (firstItem.equals(tester)){
                    location = i;
                    i = theKeyList.size();
                } else {
                    i += 1;
                }

            }
            if (location != -1) {
                node = (Node) theValList.get(location);
                inp.remove(0);
                return (run(node, inp, ans));
            } else {
                ans.add("F");
                return ans;
            }
        } else {
            return ans;
        }
    }

}