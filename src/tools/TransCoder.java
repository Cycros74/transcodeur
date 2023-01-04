package tools;

import jdk.internal.misc.JavaSecurityAccess;
import org.germain.tool.ManaBox;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.lang3.StringUtils.stripAccents;

public class TransCoder {

    private Map<Character,String> encode = new HashMap<>();
    private Map<String,Character> decode = new HashMap<>();
    public TransCoder(String keyCrypted) {
        String key = ManaBox.decrypt(keyCrypted);
        System.out.println(key);
        Character first = 'A';
        Character second = 'A';
        for (int i = 0; i < key.length(); i++) {
            //System.out.println(first.toString()+second.toString());
            this.encode.put(key.charAt(i), first.toString() + second.toString());
            this.decode.put(first.toString() + second.toString(), key.charAt(i));
            if (second != 'Z') {
                second++;
            } else {
                first++;
                second = 'A';
            }
        }
    }
/**
 *
 * @return
 */
            public Map<Character, String> getEncode() {
                return encode;
            }

            /**
             *
             * @return
             */
            public Map<String, Character> getDecode() {
                return decode;
            }


            /**
             * Méthode d'encodage
             * @param msgTest
             * @return
             */

            public String encode(String msgTest) {
                msgTest = stripAccents(msgTest);
                StringBuilder buffer = new StringBuilder();
                //System.out.println(msgTest);
                for(char ch : msgTest.toCharArray()){
                   buffer.append(encode.get(ch));
                }
                return buffer.toString();
            }

            /**
             * Méthode de décodage
0000000000000000000000000000000000000000000000000000000000000000
             */
            public String decode(String msgTest) {
                StringBuilder msgRetour = new StringBuilder();
                String[] mesgTab = new String[ msgTest.length()/2];
                int j = 0;
                //System.out.println("msgTest to tab");
                for (int i = 0 ; i < msgTest.length()-1 ; i++){
                    //System.out.println(msgTest.substring(i,i+2));
                    mesgTab[j] = msgTest.substring(i,i+2);
                    j++;
                    i++;
                }
                // System.out.println("=========================");
                //System.out.println("encodage");
                for (String couple : mesgTab){
                    //System.out.println(couple);
                    msgRetour.append(decode.get(couple));
                }

                return msgRetour.toString();
            }


        }