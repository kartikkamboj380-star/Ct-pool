.class public final LN4/x$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK5/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN4/x;-><init>(Landroid/content/Context;Lm5/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic m:LK5/b;

.field final synthetic n:LN4/x;


# direct methods
.method public constructor <init>(LK5/b;LN4/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN4/x$f;->m:LK5/b;

    .line 2
    .line 3
    iput-object p2, p0, LN4/x$f;->n:LN4/x;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LK5/c;Lm5/d;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LN4/x$f;->m:LK5/b;

    .line 2
    .line 3
    new-instance v1, LN4/x$f$a;

    .line 4
    .line 5
    iget-object v2, p0, LN4/x$f;->n:LN4/x;

    .line 6
    .line 7
    invoke-direct {v1, p1, v2}, LN4/x$f$a;-><init>(LK5/c;LN4/x;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1, p2}, LK5/b;->a(LK5/c;Lm5/d;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-ne p1, p2, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    sget-object p1, Li5/u;->a:Li5/u;

    .line 22
    .line 23
    return-object p1
.end method
