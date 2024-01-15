package design.pacakge.adapter;

// 适配器类
class Adapter implements Target {
    private LegacySystem legacySystem;

    public Adapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void newMethod() {
        // 调用LegacySystem的方法
        legacySystem.legacyMethod();
    }
}
