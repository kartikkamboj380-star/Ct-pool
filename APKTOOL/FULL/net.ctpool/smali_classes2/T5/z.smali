.class public LT5/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements LT5/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT5/z$a;,
        LT5/z$b;
    }
.end annotation


# static fields
.field private static final Q:Ljava/util/List;

.field private static final R:Ljava/util/List;

.field public static final S:LT5/z$b;


# instance fields
.field private final A:LT5/b;

.field private final B:Ljavax/net/SocketFactory;

.field private final C:Ljavax/net/ssl/SSLSocketFactory;

.field private final D:Ljavax/net/ssl/X509TrustManager;

.field private final E:Ljava/util/List;

.field private final F:Ljava/util/List;

.field private final G:Ljavax/net/ssl/HostnameVerifier;

.field private final H:LT5/g;

.field private final I:Lg6/c;

.field private final J:I

.field private final K:I

.field private final L:I

.field private final M:I

.field private final N:I

.field private final O:J

.field private final P:LY5/i;

.field private final m:LT5/p;

.field private final n:LT5/k;

.field private final o:Ljava/util/List;

.field private final p:Ljava/util/List;

.field private final q:LT5/r$c;

.field private final r:Z

.field private final s:LT5/b;

.field private final t:Z

.field private final u:Z

.field private final v:LT5/n;

.field private final w:LT5/c;

.field private final x:LT5/q;

.field private final y:Ljava/net/Proxy;

.field private final z:Ljava/net/ProxySelector;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LT5/z$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LT5/z$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LT5/z;->S:LT5/z$b;

    .line 8
    .line 9
    sget-object v0, LT5/A;->q:LT5/A;

    .line 10
    .line 11
    sget-object v1, LT5/A;->o:LT5/A;

    .line 12
    .line 13
    filled-new-array {v0, v1}, [LT5/A;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, LU5/c;->t([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, LT5/z;->Q:Ljava/util/List;

    .line 22
    .line 23
    sget-object v0, LT5/l;->h:LT5/l;

    .line 24
    .line 25
    sget-object v1, LT5/l;->j:LT5/l;

    .line 26
    .line 27
    filled-new-array {v0, v1}, [LT5/l;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, LU5/c;->t([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, LT5/z;->R:Ljava/util/List;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, LT5/z$a;

    invoke-direct {v0}, LT5/z$a;-><init>()V

    invoke-direct {p0, v0}, LT5/z;-><init>(LT5/z$a;)V

    return-void
.end method

.method public constructor <init>(LT5/z$a;)V
    .locals 3

    .line 2
    const-string v0, "builder"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LT5/z$a;->q()LT5/p;

    move-result-object v0

    iput-object v0, p0, LT5/z;->m:LT5/p;

    invoke-virtual {p1}, LT5/z$a;->n()LT5/k;

    move-result-object v0

    iput-object v0, p0, LT5/z;->n:LT5/k;

    invoke-virtual {p1}, LT5/z$a;->w()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LU5/c;->R(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LT5/z;->o:Ljava/util/List;

    invoke-virtual {p1}, LT5/z$a;->y()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LU5/c;->R(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LT5/z;->p:Ljava/util/List;

    invoke-virtual {p1}, LT5/z$a;->s()LT5/r$c;

    move-result-object v0

    iput-object v0, p0, LT5/z;->q:LT5/r$c;

    invoke-virtual {p1}, LT5/z$a;->F()Z

    move-result v0

    iput-boolean v0, p0, LT5/z;->r:Z

    invoke-virtual {p1}, LT5/z$a;->h()LT5/b;

    move-result-object v0

    iput-object v0, p0, LT5/z;->s:LT5/b;

    invoke-virtual {p1}, LT5/z$a;->t()Z

    move-result v0

    iput-boolean v0, p0, LT5/z;->t:Z

    invoke-virtual {p1}, LT5/z$a;->u()Z

    move-result v0

    iput-boolean v0, p0, LT5/z;->u:Z

    invoke-virtual {p1}, LT5/z$a;->p()LT5/n;

    move-result-object v0

    iput-object v0, p0, LT5/z;->v:LT5/n;

    invoke-virtual {p1}, LT5/z$a;->i()LT5/c;

    move-result-object v0

    iput-object v0, p0, LT5/z;->w:LT5/c;

    invoke-virtual {p1}, LT5/z$a;->r()LT5/q;

    move-result-object v0

    iput-object v0, p0, LT5/z;->x:LT5/q;

    invoke-virtual {p1}, LT5/z$a;->B()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, LT5/z;->y:Ljava/net/Proxy;

    invoke-virtual {p1}, LT5/z$a;->B()Ljava/net/Proxy;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    sget-object v0, Lf6/a;->a:Lf6/a;

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LT5/z$a;->D()Ljava/net/ProxySelector;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    :goto_1
    iput-object v0, p0, LT5/z;->z:Ljava/net/ProxySelector;

    invoke-virtual {p1}, LT5/z$a;->C()LT5/b;

    move-result-object v0

    iput-object v0, p0, LT5/z;->A:LT5/b;

    invoke-virtual {p1}, LT5/z$a;->H()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, LT5/z;->B:Ljavax/net/SocketFactory;

    invoke-virtual {p1}, LT5/z$a;->o()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LT5/z;->E:Ljava/util/List;

    invoke-virtual {p1}, LT5/z$a;->A()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LT5/z;->F:Ljava/util/List;

    invoke-virtual {p1}, LT5/z$a;->v()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iput-object v1, p0, LT5/z;->G:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {p1}, LT5/z$a;->j()I

    move-result v1

    iput v1, p0, LT5/z;->J:I

    invoke-virtual {p1}, LT5/z$a;->m()I

    move-result v1

    iput v1, p0, LT5/z;->K:I

    invoke-virtual {p1}, LT5/z$a;->E()I

    move-result v1

    iput v1, p0, LT5/z;->L:I

    invoke-virtual {p1}, LT5/z$a;->J()I

    move-result v1

    iput v1, p0, LT5/z;->M:I

    invoke-virtual {p1}, LT5/z$a;->z()I

    move-result v1

    iput v1, p0, LT5/z;->N:I

    invoke-virtual {p1}, LT5/z$a;->x()J

    move-result-wide v1

    iput-wide v1, p0, LT5/z;->O:J

    invoke-virtual {p1}, LT5/z$a;->G()LY5/i;

    move-result-object v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, LY5/i;

    invoke-direct {v1}, LY5/i;-><init>()V

    :goto_2
    iput-object v1, p0, LT5/z;->P:LY5/i;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_5

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT5/l;

    invoke-virtual {v1}, LT5/l;->f()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, LT5/z$a;->I()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, LT5/z$a;->I()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, LT5/z;->C:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {p1}, LT5/z$a;->k()Lg6/c;

    move-result-object v0

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    iput-object v0, p0, LT5/z;->I:Lg6/c;

    invoke-virtual {p1}, LT5/z$a;->K()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    iput-object v1, p0, LT5/z;->D:Ljavax/net/ssl/X509TrustManager;

    :goto_3
    invoke-virtual {p1}, LT5/z$a;->l()LT5/g;

    move-result-object p1

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, LT5/g;->e(Lg6/c;)LT5/g;

    move-result-object p1

    :goto_4
    iput-object p1, p0, LT5/z;->H:LT5/g;

    goto :goto_6

    :cond_6
    sget-object v0, Ld6/j;->c:Ld6/j$a;

    invoke-virtual {v0}, Ld6/j$a;->g()Ld6/j;

    move-result-object v1

    invoke-virtual {v1}, Ld6/j;->p()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    iput-object v1, p0, LT5/z;->D:Ljavax/net/ssl/X509TrustManager;

    invoke-virtual {v0}, Ld6/j$a;->g()Ld6/j;

    move-result-object v0

    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ld6/j;->o(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, LT5/z;->C:Ljavax/net/ssl/SSLSocketFactory;

    sget-object v0, Lg6/c;->a:Lg6/c$a;

    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lg6/c$a;->a(Ljavax/net/ssl/X509TrustManager;)Lg6/c;

    move-result-object v0

    iput-object v0, p0, LT5/z;->I:Lg6/c;

    goto :goto_3

    :cond_7
    :goto_5
    const/4 p1, 0x0

    iput-object p1, p0, LT5/z;->C:Ljavax/net/ssl/SSLSocketFactory;

    iput-object p1, p0, LT5/z;->I:Lg6/c;

    iput-object p1, p0, LT5/z;->D:Ljavax/net/ssl/X509TrustManager;

    sget-object p1, LT5/g;->c:LT5/g;

    goto :goto_4

    :goto_6
    invoke-direct {p0}, LT5/z;->M()V

    return-void
.end method

.method private final M()V
    .locals 4

    .line 1
    iget-object v0, p0, LT5/z;->o:Ljava/util/List;

    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    if-eqz v0, :cond_10

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x1

    xor-int/2addr v0, v3

    if-eqz v0, :cond_f

    iget-object v0, p0, LT5/z;->p:Ljava/util/List;

    if-eqz v0, :cond_e

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v3

    if-eqz v0, :cond_d

    iget-object v0, p0, LT5/z;->E:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT5/l;

    invoke-virtual {v1}, LT5/l;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, LT5/z;->C:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_4

    iget-object v0, p0, LT5/z;->I:Lg6/c;

    if-eqz v0, :cond_3

    iget-object v0, p0, LT5/z;->D:Ljavax/net/ssl/X509TrustManager;

    if-eqz v0, :cond_2

    goto :goto_4

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "x509TrustManager == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "certificateChainCleaner == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "sslSocketFactory == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_0
    iget-object v0, p0, LT5/z;->C:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    move v0, v3

    goto :goto_1

    :cond_6
    move v0, v1

    :goto_1
    const-string v2, "Check failed."

    if-eqz v0, :cond_c

    iget-object v0, p0, LT5/z;->I:Lg6/c;

    if-nez v0, :cond_7

    move v0, v3

    goto :goto_2

    :cond_7
    move v0, v1

    :goto_2
    if-eqz v0, :cond_b

    iget-object v0, p0, LT5/z;->D:Ljavax/net/ssl/X509TrustManager;

    if-nez v0, :cond_8

    goto :goto_3

    :cond_8
    move v3, v1

    :goto_3
    if-eqz v3, :cond_a

    iget-object v0, p0, LT5/z;->H:LT5/g;

    sget-object v1, LT5/g;->c:LT5/g;

    invoke-static {v0, v1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    :goto_4
    return-void

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null network interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT5/z;->p:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT5/z;->o:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic b()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, LT5/z;->R:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, LT5/z;->Q:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d(LT5/z;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 0

    .line 1
    iget-object p0, p0, LT5/z;->C:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final A()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public B()LT5/z$a;
    .locals 1

    .line 1
    new-instance v0, LT5/z$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LT5/z$a;-><init>(LT5/z;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public C(LT5/B;LT5/I;)LT5/H;
    .locals 11

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lh6/d;

    .line 12
    .line 13
    sget-object v2, LX5/e;->h:LX5/e;

    .line 14
    .line 15
    new-instance v5, Ljava/util/Random;

    .line 16
    .line 17
    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    .line 18
    .line 19
    .line 20
    iget v1, p0, LT5/z;->N:I

    .line 21
    .line 22
    int-to-long v6, v1

    .line 23
    const/4 v8, 0x0

    .line 24
    iget-wide v9, p0, LT5/z;->O:J

    .line 25
    .line 26
    move-object v1, v0

    .line 27
    move-object v3, p1

    .line 28
    move-object v4, p2

    .line 29
    invoke-direct/range {v1 .. v10}, Lh6/d;-><init>(LX5/e;LT5/B;LT5/I;Ljava/util/Random;JLh6/e;J)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lh6/d;->p(LT5/z;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public final D()I
    .locals 1

    .line 1
    iget v0, p0, LT5/z;->N:I

    .line 2
    .line 3
    return v0
.end method

.method public final E()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->F:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->y:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()LT5/b;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->A:LT5/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->z:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()I
    .locals 1

    .line 1
    iget v0, p0, LT5/z;->L:I

    .line 2
    .line 3
    return v0
.end method

.method public final J()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LT5/z;->r:Z

    .line 2
    .line 3
    return v0
.end method

.method public final K()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->B:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Ljavax/net/ssl/SSLSocketFactory;
    .locals 2

    .line 1
    iget-object v0, p0, LT5/z;->C:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "CLEARTEXT-only client"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final N()I
    .locals 1

    .line 1
    iget v0, p0, LT5/z;->M:I

    .line 2
    .line 3
    return v0
.end method

.method public final O()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->D:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public a(LT5/B;)LT5/e;
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LY5/e;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, LY5/e;-><init>(LT5/z;LT5/B;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final e()LT5/b;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->s:LT5/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()LT5/c;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->w:LT5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, LT5/z;->J:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()Lg6/c;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->I:Lg6/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()LT5/g;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->H:LT5/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, LT5/z;->K:I

    .line 2
    .line 3
    return v0
.end method

.method public final l()LT5/k;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->n:LT5/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->E:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()LT5/n;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->v:LT5/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()LT5/p;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->m:LT5/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()LT5/q;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->x:LT5/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()LT5/r$c;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->q:LT5/r$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LT5/z;->t:Z

    .line 2
    .line 3
    return v0
.end method

.method public final u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LT5/z;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method public final v()LY5/i;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->P:LY5/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->G:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LT5/z;->o:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()J
    .locals 2

    .line 1
    iget-wide v0, p0, LT5/z;->O:J

    .line 2
    .line 3
    return-wide v0
.end method
