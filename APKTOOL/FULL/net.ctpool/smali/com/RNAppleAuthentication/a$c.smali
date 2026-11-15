.class public abstract enum Lcom/RNAppleAuthentication/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/RNAppleAuthentication/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/RNAppleAuthentication/a$c$a;,
        Lcom/RNAppleAuthentication/a$c$b;,
        Lcom/RNAppleAuthentication/a$c$c;
    }
.end annotation


# static fields
.field public static final enum m:Lcom/RNAppleAuthentication/a$c;

.field public static final enum n:Lcom/RNAppleAuthentication/a$c;

.field public static final enum o:Lcom/RNAppleAuthentication/a$c;

.field private static final synthetic p:[Lcom/RNAppleAuthentication/a$c;

.field private static final synthetic q:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/RNAppleAuthentication/a$c$c;

    const-string v1, "NAME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/RNAppleAuthentication/a$c$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/RNAppleAuthentication/a$c;->m:Lcom/RNAppleAuthentication/a$c;

    new-instance v0, Lcom/RNAppleAuthentication/a$c$b;

    const-string v1, "EMAIL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/RNAppleAuthentication/a$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/RNAppleAuthentication/a$c;->n:Lcom/RNAppleAuthentication/a$c;

    new-instance v0, Lcom/RNAppleAuthentication/a$c$a;

    const-string v1, "ALL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/RNAppleAuthentication/a$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/RNAppleAuthentication/a$c;->o:Lcom/RNAppleAuthentication/a$c;

    invoke-static {}, Lcom/RNAppleAuthentication/a$c;->e()[Lcom/RNAppleAuthentication/a$c;

    move-result-object v0

    sput-object v0, Lcom/RNAppleAuthentication/a$c;->p:[Lcom/RNAppleAuthentication/a$c;

    invoke-static {v0}, Lp5/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/RNAppleAuthentication/a$c;->q:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/RNAppleAuthentication/a$c;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lcom/RNAppleAuthentication/a$c;
    .locals 3

    .line 1
    sget-object v0, Lcom/RNAppleAuthentication/a$c;->m:Lcom/RNAppleAuthentication/a$c;

    sget-object v1, Lcom/RNAppleAuthentication/a$c;->n:Lcom/RNAppleAuthentication/a$c;

    sget-object v2, Lcom/RNAppleAuthentication/a$c;->o:Lcom/RNAppleAuthentication/a$c;

    filled-new-array {v0, v1, v2}, [Lcom/RNAppleAuthentication/a$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$c;
    .locals 1

    const-class v0, Lcom/RNAppleAuthentication/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/RNAppleAuthentication/a$c;

    return-object p0
.end method

.method public static values()[Lcom/RNAppleAuthentication/a$c;
    .locals 1

    sget-object v0, Lcom/RNAppleAuthentication/a$c;->p:[Lcom/RNAppleAuthentication/a$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/RNAppleAuthentication/a$c;

    return-object v0
.end method


# virtual methods
.method public abstract h()Ljava/lang/String;
.end method
