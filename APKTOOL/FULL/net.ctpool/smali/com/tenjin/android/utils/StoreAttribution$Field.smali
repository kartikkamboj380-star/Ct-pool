.class public final enum Lcom/tenjin/android/utils/StoreAttribution$Field;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tenjin/android/utils/StoreAttribution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Field"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tenjin/android/utils/StoreAttribution$Field;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/tenjin/android/utils/StoreAttribution$Field;

.field public static final enum ClickTimestamp:Lcom/tenjin/android/utils/StoreAttribution$Field;

.field public static final enum InstallTimestamp:Lcom/tenjin/android/utils/StoreAttribution$Field;

.field public static final enum Referrer:Lcom/tenjin/android/utils/StoreAttribution$Field;


# direct methods
.method private static synthetic $values()[Lcom/tenjin/android/utils/StoreAttribution$Field;
    .locals 3

    sget-object v0, Lcom/tenjin/android/utils/StoreAttribution$Field;->Referrer:Lcom/tenjin/android/utils/StoreAttribution$Field;

    sget-object v1, Lcom/tenjin/android/utils/StoreAttribution$Field;->ClickTimestamp:Lcom/tenjin/android/utils/StoreAttribution$Field;

    sget-object v2, Lcom/tenjin/android/utils/StoreAttribution$Field;->InstallTimestamp:Lcom/tenjin/android/utils/StoreAttribution$Field;

    filled-new-array {v0, v1, v2}, [Lcom/tenjin/android/utils/StoreAttribution$Field;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/tenjin/android/utils/StoreAttribution$Field;

    const-string v1, "Referrer"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/utils/StoreAttribution$Field;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/utils/StoreAttribution$Field;->Referrer:Lcom/tenjin/android/utils/StoreAttribution$Field;

    new-instance v0, Lcom/tenjin/android/utils/StoreAttribution$Field;

    const-string v1, "ClickTimestamp"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/utils/StoreAttribution$Field;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/utils/StoreAttribution$Field;->ClickTimestamp:Lcom/tenjin/android/utils/StoreAttribution$Field;

    new-instance v0, Lcom/tenjin/android/utils/StoreAttribution$Field;

    const-string v1, "InstallTimestamp"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/utils/StoreAttribution$Field;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/utils/StoreAttribution$Field;->InstallTimestamp:Lcom/tenjin/android/utils/StoreAttribution$Field;

    invoke-static {}, Lcom/tenjin/android/utils/StoreAttribution$Field;->$values()[Lcom/tenjin/android/utils/StoreAttribution$Field;

    move-result-object v0

    sput-object v0, Lcom/tenjin/android/utils/StoreAttribution$Field;->$VALUES:[Lcom/tenjin/android/utils/StoreAttribution$Field;

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

.method public static valueOf(Ljava/lang/String;)Lcom/tenjin/android/utils/StoreAttribution$Field;
    .locals 1

    const-class v0, Lcom/tenjin/android/utils/StoreAttribution$Field;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tenjin/android/utils/StoreAttribution$Field;

    return-object p0
.end method

.method public static values()[Lcom/tenjin/android/utils/StoreAttribution$Field;
    .locals 1

    sget-object v0, Lcom/tenjin/android/utils/StoreAttribution$Field;->$VALUES:[Lcom/tenjin/android/utils/StoreAttribution$Field;

    invoke-virtual {v0}, [Lcom/tenjin/android/utils/StoreAttribution$Field;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tenjin/android/utils/StoreAttribution$Field;

    return-object v0
.end method
