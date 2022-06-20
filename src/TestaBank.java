class TestaBank{
    public static void main(String[] args) {

        Conta conta = new Conta(1222, 21222);
        conta.deposita(200);
        System.out.println("O saldo é " + conta.getSaldo());
        conta.setAgencia(333);
        System.out.println("A agência é " + conta.getAgencia());


        Conta conta1 = new Conta(122, 12122);
        conta1.deposita(2333);
        conta1.transfere(139, conta);
        conta1.saca(100);




    }
}

