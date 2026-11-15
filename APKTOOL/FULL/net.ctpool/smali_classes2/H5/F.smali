.class public abstract LH5/F;
.super Lm5/a;
.source "SourceFile"

# interfaces
.implements Lm5/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH5/F$a;
    }
.end annotation


# static fields
.field public static final n:LH5/F$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LH5/F$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LH5/F$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LH5/F;->n:LH5/F$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lm5/e;->l:Lm5/e$b;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lm5/a;-><init>(Lm5/g$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final J(Lm5/d;)Lm5/d;
    .locals 1

    .line 1
    new-instance v0, LM5/j;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LM5/j;-><init>(LH5/F;Lm5/d;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public R0(I)LH5/F;
    .locals 1

    .line 1
    invoke-static {p1}, LM5/n;->a(I)V

    .line 2
    .line 3
    .line 4
    new-instance v0, LM5/m;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, LM5/m;-><init>(LH5/F;I)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public abstract a(Lm5/g;Ljava/lang/Runnable;)V
.end method

.method public b(Lm5/g$c;)Lm5/g$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm5/e$a;->a(Lm5/e;Lm5/g$c;)Lm5/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public g(Lm5/g;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public h0(Lm5/g$c;)Lm5/g;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm5/e$a;->b(Lm5/e;Lm5/g$c;)Lm5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LH5/M;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x40

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, LH5/M;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method public final z(Lm5/d;)V
    .locals 1

    .line 1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LM5/j;

    .line 7
    .line 8
    invoke-virtual {p1}, LM5/j;->u()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
