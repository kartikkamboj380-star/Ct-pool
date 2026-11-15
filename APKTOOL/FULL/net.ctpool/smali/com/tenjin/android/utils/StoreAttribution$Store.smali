.class public final enum Lcom/tenjin/android/utils/StoreAttribution$Store;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tenjin/android/utils/StoreAttribution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Store"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tenjin/android/utils/StoreAttribution$Store;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/tenjin/android/utils/StoreAttribution$Store;

.field public static final enum Huawei:Lcom/tenjin/android/utils/StoreAttribution$Store;

.field public static final enum PlayStore:Lcom/tenjin/android/utils/StoreAttribution$Store;


# direct methods
.method private static synthetic $values()[Lcom/tenjin/android/utils/StoreAttribution$Store;
    .locals 2

    sget-object v0, Lcom/tenjin/android/utils/StoreAttribution$Store;->PlayStore:Lcom/tenjin/android/utils/StoreAttribution$Store;

    sget-object v1, Lcom/tenjin/android/utils/StoreAttribution$Store;->Huawei:Lcom/tenjin/android/utils/StoreAttribution$Store;

    filled-new-array {v0, v1}, [Lcom/tenjin/android/utils/StoreAttribution$Store;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/tenjin/android/utils/StoreAttribution$Store;

    const-string v1, "PlayStore"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/utils/StoreAttribution$Store;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/utils/StoreAttribution$Store;->PlayStore:Lcom/tenjin/android/utils/StoreAttribution$Store;

    new-instance v0, Lcom/tenjin/android/utils/StoreAttribution$Store;

    const-string v1, "Huawei"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/utils/StoreAttribution$Store;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/utils/StoreAttribution$Store;->Huawei:Lcom/tenjin/android/utils/StoreAttribution$Store;

    invoke-static {}, Lcom/tenjin/android/utils/StoreAttribution$Store;->$values()[Lcom/tenjin/android/utils/StoreAttribution$Store;

    move-result-object v0

    sput-object v0, Lcom/tenjin/android/utils/StoreAttribution$Store;->$VALUES:[Lcom/tenjin/android/utils/StoreAttribution$Store;

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

.method public static valueOf(Ljava/lang/String;)Lcom/tenjin/android/utils/StoreAttribution$Store;
    .locals 1

    const-class v0, Lcom/tenjin/android/utils/StoreAttribution$Store;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tenjin/android/utils/StoreAttribution$Store;

    return-object p0
.end method

.method public static values()[Lcom/tenjin/android/utils/StoreAttribution$Store;
    .locals 1

    sget-object v0, Lcom/tenjin/android/utils/StoreAttribution$Store;->$VALUES:[Lcom/tenjin/android/utils/StoreAttribution$Store;

    invoke-virtual {v0}, [Lcom/tenjin/android/utils/StoreAttribution$Store;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tenjin/android/utils/StoreAttribution$Store;

    return-object v0
.end method
