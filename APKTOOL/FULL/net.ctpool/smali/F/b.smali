.class public final LF/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC/f;


# instance fields
.field private final a:LC/f;


# direct methods
.method public constructor <init>(LC/f;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LF/b;->a:LC/f;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Lv5/p;Lm5/d;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LF/b;->a:LC/f;

    .line 2
    .line 3
    new-instance v1, LF/b$a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, v2}, LF/b$a;-><init>(Lv5/p;Lm5/d;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1, p2}, LC/f;->a(Lv5/p;Lm5/d;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public getData()LK5/b;
    .locals 1

    .line 1
    iget-object v0, p0, LF/b;->a:LC/f;

    .line 2
    .line 3
    invoke-interface {v0}, LC/f;->getData()LK5/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
