.class final LT2/m$b;
.super LT2/w$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:LT2/w$c;

.field private b:LT2/w$b;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LT2/w$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()LT2/w;
    .locals 4

    .line 1
    new-instance v0, LT2/m;

    .line 2
    .line 3
    iget-object v1, p0, LT2/m$b;->a:LT2/w$c;

    .line 4
    .line 5
    iget-object v2, p0, LT2/m$b;->b:LT2/w$b;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, LT2/m;-><init>(LT2/w$c;LT2/w$b;LT2/m$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public b(LT2/w$b;)LT2/w$a;
    .locals 0

    .line 1
    iput-object p1, p0, LT2/m$b;->b:LT2/w$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public c(LT2/w$c;)LT2/w$a;
    .locals 0

    .line 1
    iput-object p1, p0, LT2/m$b;->a:LT2/w$c;

    .line 2
    .line 3
    return-object p0
.end method
