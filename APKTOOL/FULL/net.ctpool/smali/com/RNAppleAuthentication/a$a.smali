.class public final Lcom/RNAppleAuthentication/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/RNAppleAuthentication/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/RNAppleAuthentication/a;
    .locals 11

    .line 1
    new-instance v9, Lcom/RNAppleAuthentication/a;

    iget-object v0, p0, Lcom/RNAppleAuthentication/a$a;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "clientId"

    invoke-static {v0}, Lw5/k;->t(Ljava/lang/String;)V

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    iget-object v0, p0, Lcom/RNAppleAuthentication/a$a;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, "redirectUri"

    invoke-static {v0}, Lw5/k;->t(Ljava/lang/String;)V

    move-object v3, v1

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    iget-object v0, p0, Lcom/RNAppleAuthentication/a$a;->c:Ljava/lang/String;

    if-nez v0, :cond_2

    const-string v0, "scope"

    invoke-static {v0}, Lw5/k;->t(Ljava/lang/String;)V

    move-object v4, v1

    goto :goto_2

    :cond_2
    move-object v4, v0

    :goto_2
    iget-object v0, p0, Lcom/RNAppleAuthentication/a$a;->d:Ljava/lang/String;

    if-nez v0, :cond_3

    const-string v0, "responseType"

    invoke-static {v0}, Lw5/k;->t(Ljava/lang/String;)V

    move-object v5, v1

    goto :goto_3

    :cond_3
    move-object v5, v0

    :goto_3
    iget-object v0, p0, Lcom/RNAppleAuthentication/a$a;->e:Ljava/lang/String;

    if-nez v0, :cond_4

    const-string v0, "state"

    invoke-static {v0}, Lw5/k;->t(Ljava/lang/String;)V

    move-object v6, v1

    goto :goto_4

    :cond_4
    move-object v6, v0

    :goto_4
    iget-object v0, p0, Lcom/RNAppleAuthentication/a$a;->f:Ljava/lang/String;

    if-nez v0, :cond_5

    const-string v0, "rawNonce"

    invoke-static {v0}, Lw5/k;->t(Ljava/lang/String;)V

    move-object v7, v1

    goto :goto_5

    :cond_5
    move-object v7, v0

    :goto_5
    iget-object v0, p0, Lcom/RNAppleAuthentication/a$a;->g:Ljava/lang/String;

    if-nez v0, :cond_6

    const-string v0, "nonce"

    invoke-static {v0}, Lw5/k;->t(Ljava/lang/String;)V

    move-object v8, v1

    goto :goto_6

    :cond_6
    move-object v8, v0

    :goto_6
    const/4 v10, 0x0

    move-object v0, v9

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v10

    invoke-direct/range {v0 .. v8}, Lcom/RNAppleAuthentication/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method public final b(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$a;
    .locals 1

    .line 1
    const-string v0, "clientId"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/RNAppleAuthentication/a$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$a;
    .locals 1

    .line 1
    const-string v0, "nonce"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/RNAppleAuthentication/a$a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$a;
    .locals 1

    .line 1
    const-string v0, "rawNonce"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/RNAppleAuthentication/a$a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$a;
    .locals 1

    .line 1
    const-string v0, "redirectUri"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/RNAppleAuthentication/a$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final f(Lcom/RNAppleAuthentication/a$b;)Lcom/RNAppleAuthentication/a$a;
    .locals 1

    .line 1
    const-string v0, "type"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/RNAppleAuthentication/a$b;->h()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/RNAppleAuthentication/a$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final g(Lcom/RNAppleAuthentication/a$c;)Lcom/RNAppleAuthentication/a$a;
    .locals 1

    .line 1
    const-string v0, "scope"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/RNAppleAuthentication/a$c;->h()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/RNAppleAuthentication/a$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final h(Ljava/lang/String;)Lcom/RNAppleAuthentication/a$a;
    .locals 1

    .line 1
    const-string v0, "state"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/RNAppleAuthentication/a$a;->e:Ljava/lang/String;

    return-object p0
.end method
