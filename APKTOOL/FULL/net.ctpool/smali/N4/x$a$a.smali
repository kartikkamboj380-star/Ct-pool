.class final LN4/x$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN4/x$a;->s(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:LN4/x;


# direct methods
.method constructor <init>(LN4/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN4/x$a$a;->m:LN4/x;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LN4/l;Lm5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, LN4/x$a$a;->m:LN4/x;

    .line 2
    .line 3
    invoke-static {p2}, LN4/x;->e(LN4/x;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Li5/u;->a:Li5/u;

    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LN4/l;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LN4/x$a$a;->a(LN4/l;Lm5/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
