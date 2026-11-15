.class public Le4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LD4/a;


# direct methods
.method public constructor <init>(LD4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le4/l;->a:LD4/a;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Le4/e;LD4/b;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Le4/l;->b(Le4/e;LD4/b;)V

    return-void
.end method

.method private static synthetic b(Le4/e;LD4/b;)V
    .locals 0

    .line 1
    invoke-interface {p1}, LD4/b;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    throw p0
.end method


# virtual methods
.method public c(Lj4/n;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "Didn\'t successfully register with UserMetadata for rollouts listener"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Le4/g;->k(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v0, Le4/e;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Le4/e;-><init>(Lj4/n;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Le4/l;->a:LD4/a;

    .line 19
    .line 20
    new-instance v1, Le4/k;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Le4/k;-><init>(Le4/e;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, v1}, LD4/a;->a(LD4/a$a;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
