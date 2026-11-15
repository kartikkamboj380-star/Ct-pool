.class public final Ll0/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ll0/k$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Ll0/k;
    .locals 1

    .line 1
    const-string v0, "workerClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ll0/k$a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ll0/k$a;-><init>(Ljava/lang/Class;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ll0/u$a;->b()Ll0/u;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ll0/k;

    .line 16
    .line 17
    return-object p1
.end method
