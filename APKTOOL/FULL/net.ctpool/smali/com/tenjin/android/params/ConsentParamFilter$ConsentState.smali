.class public final enum Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tenjin/android/params/ConsentParamFilter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ConsentState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

.field public static final enum EXPLICIT_OPTIN:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

.field public static final enum EXPLICIT_OPTIN_WHITELIST:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

.field public static final enum EXPLICIT_OPTOUT:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

.field public static final enum EXPLICIT_OPTOUT_BLACKLIST:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

.field public static final enum IMPLICIT:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;


# direct methods
.method private static synthetic $values()[Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;
    .locals 5

    sget-object v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->EXPLICIT_OPTIN:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    sget-object v1, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->EXPLICIT_OPTOUT:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    sget-object v2, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->EXPLICIT_OPTOUT_BLACKLIST:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    sget-object v3, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->EXPLICIT_OPTIN_WHITELIST:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    sget-object v4, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->IMPLICIT:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    const-string v1, "EXPLICIT_OPTIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->EXPLICIT_OPTIN:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    new-instance v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    const-string v1, "EXPLICIT_OPTOUT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->EXPLICIT_OPTOUT:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    new-instance v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    const-string v1, "EXPLICIT_OPTOUT_BLACKLIST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->EXPLICIT_OPTOUT_BLACKLIST:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    new-instance v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    const-string v1, "EXPLICIT_OPTIN_WHITELIST"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->EXPLICIT_OPTIN_WHITELIST:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    new-instance v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    const-string v1, "IMPLICIT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->IMPLICIT:Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    invoke-static {}, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->$values()[Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    move-result-object v0

    sput-object v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->$VALUES:[Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

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

.method public static valueOf(Ljava/lang/String;)Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;
    .locals 1

    const-class v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    return-object p0
.end method

.method public static values()[Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;
    .locals 1

    sget-object v0, Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->$VALUES:[Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    invoke-virtual {v0}, [Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tenjin/android/params/ConsentParamFilter$ConsentState;

    return-object v0
.end method
