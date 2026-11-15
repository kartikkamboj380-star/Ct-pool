.class public final enum Lcom/tenjin/android/TenjinSDK$AppStoreType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tenjin/android/TenjinSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AppStoreType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tenjin/android/TenjinSDK$AppStoreType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/tenjin/android/TenjinSDK$AppStoreType;

.field public static final enum amazon:Lcom/tenjin/android/TenjinSDK$AppStoreType;

.field public static final enum googleplay:Lcom/tenjin/android/TenjinSDK$AppStoreType;

.field public static final enum other:Lcom/tenjin/android/TenjinSDK$AppStoreType;

.field public static final enum unspecified:Lcom/tenjin/android/TenjinSDK$AppStoreType;


# direct methods
.method private static synthetic $values()[Lcom/tenjin/android/TenjinSDK$AppStoreType;
    .locals 4

    sget-object v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;->unspecified:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    sget-object v1, Lcom/tenjin/android/TenjinSDK$AppStoreType;->googleplay:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    sget-object v2, Lcom/tenjin/android/TenjinSDK$AppStoreType;->amazon:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    sget-object v3, Lcom/tenjin/android/TenjinSDK$AppStoreType;->other:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/tenjin/android/TenjinSDK$AppStoreType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;

    const-string v1, "unspecified"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/TenjinSDK$AppStoreType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;->unspecified:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    new-instance v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;

    const-string v1, "googleplay"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/TenjinSDK$AppStoreType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;->googleplay:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    new-instance v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;

    const-string v1, "amazon"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/TenjinSDK$AppStoreType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;->amazon:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    new-instance v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;

    const-string v1, "other"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/TenjinSDK$AppStoreType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;->other:Lcom/tenjin/android/TenjinSDK$AppStoreType;

    invoke-static {}, Lcom/tenjin/android/TenjinSDK$AppStoreType;->$values()[Lcom/tenjin/android/TenjinSDK$AppStoreType;

    move-result-object v0

    sput-object v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;->$VALUES:[Lcom/tenjin/android/TenjinSDK$AppStoreType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/tenjin/android/TenjinSDK$AppStoreType;
    .locals 1

    const-class v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tenjin/android/TenjinSDK$AppStoreType;

    return-object p0
.end method

.method public static values()[Lcom/tenjin/android/TenjinSDK$AppStoreType;
    .locals 1

    sget-object v0, Lcom/tenjin/android/TenjinSDK$AppStoreType;->$VALUES:[Lcom/tenjin/android/TenjinSDK$AppStoreType;

    invoke-virtual {v0}, [Lcom/tenjin/android/TenjinSDK$AppStoreType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tenjin/android/TenjinSDK$AppStoreType;

    return-object v0
.end method
