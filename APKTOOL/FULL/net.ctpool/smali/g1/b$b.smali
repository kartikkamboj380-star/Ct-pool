.class Lg1/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO0/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg1/b;->i(Lm1/a;Ljava/lang/String;Ljava/lang/Object;Lg1/b$c;)LO0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm1/a;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:Lg1/b$c;

.field final synthetic f:Lg1/b;


# direct methods
.method constructor <init>(Lg1/b;Lm1/a;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lg1/b$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg1/b$b;->f:Lg1/b;

    .line 2
    .line 3
    iput-object p2, p0, Lg1/b$b;->a:Lm1/a;

    .line 4
    .line 5
    iput-object p3, p0, Lg1/b$b;->b:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lg1/b$b;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p5, p0, Lg1/b$b;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p6, p0, Lg1/b$b;->e:Lg1/b$c;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()LY0/c;
    .locals 6

    .line 1
    iget-object v0, p0, Lg1/b$b;->f:Lg1/b;

    .line 2
    .line 3
    iget-object v1, p0, Lg1/b$b;->a:Lm1/a;

    .line 4
    .line 5
    iget-object v2, p0, Lg1/b$b;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lg1/b$b;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lg1/b$b;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, Lg1/b$b;->e:Lg1/b$c;

    .line 12
    .line 13
    invoke-virtual/range {v0 .. v5}, Lg1/b;->g(Lm1/a;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lg1/b$c;)LY0/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg1/b$b;->a()LY0/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, LO0/j;->c(Ljava/lang/Object;)LO0/j$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lg1/b$b;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "request"

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, LO0/j$a;->b(Ljava/lang/String;Ljava/lang/Object;)LO0/j$a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LO0/j$a;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method
