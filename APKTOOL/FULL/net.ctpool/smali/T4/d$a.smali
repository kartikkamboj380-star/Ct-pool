.class LT4/d$a;
.super LR4/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT4/d;->a(LR4/d;Lcom/google/gson/reflect/TypeToken;)LR4/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:LR4/q;

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:LR4/d;

.field final synthetic e:Lcom/google/gson/reflect/TypeToken;

.field final synthetic f:LT4/d;


# direct methods
.method constructor <init>(LT4/d;ZZLR4/d;Lcom/google/gson/reflect/TypeToken;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT4/d$a;->f:LT4/d;

    .line 2
    .line 3
    iput-boolean p2, p0, LT4/d$a;->b:Z

    .line 4
    .line 5
    iput-boolean p3, p0, LT4/d$a;->c:Z

    .line 6
    .line 7
    iput-object p4, p0, LT4/d$a;->d:LR4/d;

    .line 8
    .line 9
    iput-object p5, p0, LT4/d$a;->e:Lcom/google/gson/reflect/TypeToken;

    .line 10
    .line 11
    invoke-direct {p0}, LR4/q;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private e()LR4/q;
    .locals 3

    .line 1
    iget-object v0, p0, LT4/d$a;->a:LR4/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, LT4/d$a;->d:LR4/d;

    .line 7
    .line 8
    iget-object v1, p0, LT4/d$a;->f:LT4/d;

    .line 9
    .line 10
    iget-object v2, p0, LT4/d$a;->e:Lcom/google/gson/reflect/TypeToken;

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, LR4/d;->m(LR4/r;Lcom/google/gson/reflect/TypeToken;)LR4/q;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, LT4/d$a;->a:LR4/q;

    .line 17
    .line 18
    :goto_0
    return-object v0
.end method


# virtual methods
.method public b(LY4/a;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, LT4/d$a;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, LY4/a;->n1()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-direct {p0}, LT4/d$a;->e()LR4/q;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, LR4/q;->b(LY4/a;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public d(LY4/c;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LT4/d$a;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, LY4/c;->J()LY4/c;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-direct {p0}, LT4/d$a;->e()LR4/q;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1, p2}, LR4/q;->d(LY4/c;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
