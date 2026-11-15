.class final LM5/x$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM5/x;->a(Lv5/l;Ljava/lang/Object;Lm5/g;)Lv5/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Lv5/l;

.field final synthetic n:Ljava/lang/Object;

.field final synthetic o:Lm5/g;


# direct methods
.method constructor <init>(Lv5/l;Ljava/lang/Object;Lm5/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM5/x$a;->m:Lv5/l;

    .line 2
    .line 3
    iput-object p2, p0, LM5/x$a;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, LM5/x$a;->o:Lm5/g;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, LM5/x$a;->m:Lv5/l;

    .line 2
    .line 3
    iget-object v0, p0, LM5/x$a;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, LM5/x$a;->o:Lm5/g;

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, LM5/x;->b(Lv5/l;Ljava/lang/Object;Lm5/g;)V

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
    invoke-virtual {p0, p1}, LM5/x$a;->a(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Li5/u;->a:Li5/u;

    .line 7
    .line 8
    return-object p1
.end method
