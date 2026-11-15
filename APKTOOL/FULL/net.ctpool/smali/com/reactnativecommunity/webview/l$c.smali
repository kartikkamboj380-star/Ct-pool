.class final enum Lcom/reactnativecommunity/webview/l$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativecommunity/webview/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation


# static fields
.field public static final enum n:Lcom/reactnativecommunity/webview/l$c;

.field public static final enum o:Lcom/reactnativecommunity/webview/l$c;

.field public static final enum p:Lcom/reactnativecommunity/webview/l$c;

.field private static final synthetic q:[Lcom/reactnativecommunity/webview/l$c;


# instance fields
.field private final m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/reactnativecommunity/webview/l$c;

    const/4 v1, 0x0

    const-string v2, "*/*"

    const-string v3, "DEFAULT"

    invoke-direct {v0, v3, v1, v2}, Lcom/reactnativecommunity/webview/l$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/reactnativecommunity/webview/l$c;->n:Lcom/reactnativecommunity/webview/l$c;

    new-instance v0, Lcom/reactnativecommunity/webview/l$c;

    const/4 v1, 0x1

    const-string v2, "image"

    const-string v3, "IMAGE"

    invoke-direct {v0, v3, v1, v2}, Lcom/reactnativecommunity/webview/l$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/reactnativecommunity/webview/l$c;->o:Lcom/reactnativecommunity/webview/l$c;

    new-instance v0, Lcom/reactnativecommunity/webview/l$c;

    const/4 v1, 0x2

    const-string v2, "video"

    const-string v3, "VIDEO"

    invoke-direct {v0, v3, v1, v2}, Lcom/reactnativecommunity/webview/l$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/reactnativecommunity/webview/l$c;->p:Lcom/reactnativecommunity/webview/l$c;

    invoke-static {}, Lcom/reactnativecommunity/webview/l$c;->e()[Lcom/reactnativecommunity/webview/l$c;

    move-result-object v0

    sput-object v0, Lcom/reactnativecommunity/webview/l$c;->q:[Lcom/reactnativecommunity/webview/l$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/reactnativecommunity/webview/l$c;->m:Ljava/lang/String;

    return-void
.end method

.method private static synthetic e()[Lcom/reactnativecommunity/webview/l$c;
    .locals 3

    .line 1
    sget-object v0, Lcom/reactnativecommunity/webview/l$c;->n:Lcom/reactnativecommunity/webview/l$c;

    sget-object v1, Lcom/reactnativecommunity/webview/l$c;->o:Lcom/reactnativecommunity/webview/l$c;

    sget-object v2, Lcom/reactnativecommunity/webview/l$c;->p:Lcom/reactnativecommunity/webview/l$c;

    filled-new-array {v0, v1, v2}, [Lcom/reactnativecommunity/webview/l$c;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic h(Lcom/reactnativecommunity/webview/l$c;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/reactnativecommunity/webview/l$c;->m:Ljava/lang/String;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/reactnativecommunity/webview/l$c;
    .locals 1

    const-class v0, Lcom/reactnativecommunity/webview/l$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/reactnativecommunity/webview/l$c;

    return-object p0
.end method

.method public static values()[Lcom/reactnativecommunity/webview/l$c;
    .locals 1

    sget-object v0, Lcom/reactnativecommunity/webview/l$c;->q:[Lcom/reactnativecommunity/webview/l$c;

    invoke-virtual {v0}, [Lcom/reactnativecommunity/webview/l$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/reactnativecommunity/webview/l$c;

    return-object v0
.end method
