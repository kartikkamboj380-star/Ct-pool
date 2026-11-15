.class public Lcom/facebook/react/devsupport/U;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LT5/z;


# direct methods
.method public constructor <init>(LT5/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/U;->a:LT5/z;

    .line 5
    .line 6
    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "http://%s/status"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/String;LX1/g;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/facebook/react/devsupport/U;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LT5/B$a;

    .line 6
    .line 7
    invoke-direct {v0}, LT5/B$a;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, LT5/B$a;->m(Ljava/lang/String;)LT5/B$a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, LT5/B$a;->b()LT5/B;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lcom/facebook/react/devsupport/U;->a:LT5/z;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LT5/z;->a(LT5/B;)LT5/e;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance v0, Lcom/facebook/react/devsupport/U$a;

    .line 25
    .line 26
    invoke-direct {v0, p0, p2}, Lcom/facebook/react/devsupport/U$a;-><init>(Lcom/facebook/react/devsupport/U;LX1/g;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0}, LT5/e;->S0(LT5/f;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
