package design.pacakge.adapter;

public class Client {
    public static void main(String[] args) {
        // 使用适配器将LegacySystem适配到Target接口
        LegacySystem legacySystem = new LegacySystem();
        Target adapter = new Adapter(legacySystem);

        // 调用新的方法
        adapter.newMethod();
    }
}
