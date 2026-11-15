.class public final enum Lcom/tenjin/android/enums/AppStoreTypeEnum;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tenjin/android/enums/AppStoreTypeEnum;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/tenjin/android/enums/AppStoreTypeEnum;

.field public static final enum AMAZON:Lcom/tenjin/android/enums/AppStoreTypeEnum;

.field public static final enum GOOGLEPLAY:Lcom/tenjin/android/enums/AppStoreTypeEnum;

.field public static final enum OTHER:Lcom/tenjin/android/enums/AppStoreTypeEnum;

.field public static final enum UNSPECIFIED:Lcom/tenjin/android/enums/AppStoreTypeEnum;


# direct methods
.method private static final synthetic $values()[Lcom/tenjin/android/enums/AppStoreTypeEnum;
    .locals 4

    sget-object v0, Lcom/tenjin/android/enums/AppStoreTypeEnum;->UNSPECIFIED:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    sget-object v1, Lcom/tenjin/android/enums/AppStoreTypeEnum;->GOOGLEPLAY:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    sget-object v2, Lcom/tenjin/android/enums/AppStoreTypeEnum;->AMAZON:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    sget-object v3, Lcom/tenjin/android/enums/AppStoreTypeEnum;->OTHER:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    filled-new-array {v0, v1, v2, v3}, [Lcom/tenjin/android/enums/AppStoreTypeEnum;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/tenjin/android/enums/AppStoreTypeEnum;

    const-string v1, "UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/enums/AppStoreTypeEnum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/enums/AppStoreTypeEnum;->UNSPECIFIED:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    new-instance v0, Lcom/tenjin/android/enums/AppStoreTypeEnum;

    const-string v1, "GOOGLEPLAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/enums/AppStoreTypeEnum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/enums/AppStoreTypeEnum;->GOOGLEPLAY:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    new-instance v0, Lcom/tenjin/android/enums/AppStoreTypeEnum;

    const-string v1, "AMAZON"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/enums/AppStoreTypeEnum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/enums/AppStoreTypeEnum;->AMAZON:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    new-instance v0, Lcom/tenjin/android/enums/AppStoreTypeEnum;

    const-string v1, "OTHER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/enums/AppStoreTypeEnum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/enums/AppStoreTypeEnum;->OTHER:Lcom/tenjin/android/enums/AppStoreTypeEnum;

    invoke-static {}, Lcom/tenjin/android/enums/AppStoreTypeEnum;->$values()[Lcom/tenjin/android/enums/AppStoreTypeEnum;

    move-result-object v0

    sput-object v0, Lcom/tenjin/android/enums/AppStoreTypeEnum;->$VALUES:[Lcom/tenjin/android/enums/AppStoreTypeEnum;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tenjin/android/enums/AppStoreTypeEnum;
    .locals 1

    const-class v0, Lcom/tenjin/android/enums/AppStoreTypeEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tenjin/android/enums/AppStoreTypeEnum;

    return-object p0
.end method

.method public static values()[Lcom/tenjin/android/enums/AppStoreTypeEnum;
    .locals 1

    sget-object v0, Lcom/tenjin/android/enums/AppStoreTypeEnum;->$VALUES:[Lcom/tenjin/android/enums/AppStoreTypeEnum;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tenjin/android/enums/AppStoreTypeEnum;

    return-object v0
.end method
