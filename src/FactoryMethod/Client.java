package FactoryMethod;

public class Client {
    enum BankType {
        TACB,
        TVPB
    }

    public static class BankFactory {
        public static Bank GetBank(BankType bankType) {
            switch (bankType) {
                case TACB:
                    return new ACB();
                case TVPB:
                    return new VPB();
                default:
                    throw new IllegalArgumentException("This bank type is unsupported");
            }
        }
    }

    public static interface Bank {
        public String getBankName();
    }

    public static class ACB implements Bank {
        @Override
        public String getBankName() {
            return "ACB";
        }
    }

    public static class VPB implements Bank {
        @Override
        public String getBankName() {
            return "VPB";
        }
    }

    public static void main() {
        Bank acb = BankFactory.GetBank(BankType.TVPB);
        System.out.println(acb.getBankName());
    }

}
