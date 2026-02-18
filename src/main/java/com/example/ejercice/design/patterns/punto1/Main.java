package com.example.ejercice.design.patterns.punto1;

public class Main {

    public static void main(String[] args) {

        Automobile car = Automobile.builder(
                        "Corolla Cross 2026",
                        new Engine(EngineType.HYBRID, 2.0, FuelType.GASOLINE),
                        new Color("Pearl White")
                )
                .withWheel(new Wheel(new Rim(18), WheelType.SPORT))
                .withInterior(new Interior(InteriorMaterial.LEATHER, new Color("Black")))
                .withAudioSystem(new AudioSystem(AudioLevel.PREMIUM))
                .withSunroof(SunroofType.PANORAMIC)
                .withGPS(true)
                .build();
        System.out.println(car);
    }

    public record Automobile(
            String model,
            Engine engine,
            Color color,
            Wheel wheel,
            Interior interior,
            AudioSystem audioSystem,
            SunroofType sunroofType,
            boolean gpsEnabled
    ) {
        public static Builder builder(String model, Engine engine, Color color) {
            return new Builder(model, engine, color);
        }
    }

    public static final class Builder {
        private final String model;
        private final Engine engine;
        private final Color color;

        private Wheel wheel;
        private Interior interior;
        private AudioSystem audioSystem;
        private SunroofType sunroofType = SunroofType.NONE;
        private boolean gpsEnabled;

        public Builder(String model, Engine engine, Color color) {
            this.model = model;
            this.engine = engine;
            this.color = color;
        }

        public Builder withWheel(Wheel wheel) {
            this.wheel = wheel;
            return this;
        }

        public Builder withInterior(Interior interior) {
            this.interior = interior;
            return this;
        }

        public Builder withAudioSystem(AudioSystem audioSystem) {
            this.audioSystem = audioSystem;
            return this;
        }

        public Builder withSunroof(SunroofType sunroofType) {
            this.sunroofType = sunroofType;
            return this;
        }

        public Builder withGPS(boolean enabled) {
            this.gpsEnabled = enabled;
            return this;
        }

        public Automobile build() {
            return new Automobile(
                    model,
                    engine,
                    color,
                    wheel,
                    interior,
                    audioSystem,
                    sunroofType,
                    gpsEnabled
            );
        }
    }

    public record Engine(EngineType type, double displacement, FuelType fuelType) {}
    public record Wheel(Rim rim, WheelType type) {}
    public record Rim(int diameterInInches) {}
    public record Interior(InteriorMaterial material, Color color) {}
    public record AudioSystem(AudioLevel level) {}
    public record Color(String name) {}

    public enum EngineType { GASOLINE, DIESEL, HYBRID, ELECTRIC }
    public enum FuelType { GASOLINE, DIESEL, ELECTRICITY }
    public enum WheelType { ECONOMY, SPORT, OFF_ROAD }
    public enum InteriorMaterial { FABRIC, LEATHER, SYNTHETIC_LEATHER }
    public enum AudioLevel { BASIC, PREMIUM }
    public enum SunroofType { NONE, PANORAMIC }
}