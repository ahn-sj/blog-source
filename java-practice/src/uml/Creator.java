package uml;


public class Creator {
    // @Embedded
    private Platform platform;
}

// @Embeddable
class Platform {
    // @Embedded
    private PlatformUrl platformUrl;

    // @Embedded
    private PlatformType platformType;
}

enum PlatformUrl {}
enum PlatformType {}