import java.util.Arrays;

public class TestHash {
    public static void main(String[] args) {
        Integer[] tabChaves = new Integer[] { 23, 45, 77, 11, 33, 49, 10, 4, 89, 14 };
        Integer[] tabHash = new Integer[10];

        for (Integer codigoEmpregado : tabChaves) {
            Integer indiceHash = hash(codigoEmpregado, tabHash.length);

            while (tabHash[indiceHash] != null) {
                indiceHash = rehashing(tabHash, indiceHash);
                if (indiceHash == null) {
                    break;
                }
            }

            if (indiceHash != null) {
                tabHash[indiceHash] = codigoEmpregado;
            }
        }

        System.out.println(Arrays.toString(tabHash));
    }

    public static Integer hash(Integer codigoEmpregado, Integer tamanhoTabela) {
        return codigoEmpregado % tamanhoTabela;
    }

    public static Integer rehashing(Integer[] tabHash, Integer indice) {
        for (Integer i = indice; i < tabHash.length; i++) {
            if (tabHash[i] == null) {
                return i;
            }
        }

        return rehashing(tabHash, 0);
    }
}
