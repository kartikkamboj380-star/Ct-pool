.class final LQ5/b$a$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ5/b$a;->d(Li5/u;Lv5/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:LQ5/b;

.field final synthetic n:LQ5/b$a;


# direct methods
.method constructor <init>(LQ5/b;LQ5/b$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ5/b$a$a;->m:LQ5/b;

    .line 2
    .line 3
    iput-object p2, p0, LQ5/b$a$a;->n:LQ5/b$a;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, LQ5/b$a$a;->m:LQ5/b;

    .line 2
    .line 3
    iget-object v0, p0, LQ5/b$a$a;->n:LQ5/b$a;

    .line 4
    .line 5
    iget-object v0, v0, LQ5/b$a;->n:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, LQ5/b;->c(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LQ5/b$a$a;->a(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Li5/u;->a:Li5/u;

    .line 7
    .line 8
    return-object p1
.end method
