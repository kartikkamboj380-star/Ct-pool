.class public Lu4/g;
.super Lt4/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu4/g$e;,
        Lu4/g$c;,
        Lu4/g$b;,
        Lu4/g$d;,
        Lu4/g$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/GoogleApi;

.field private final b:LD4/b;

.field private final c:LY3/f;


# direct methods
.method public constructor <init>(LY3/f;LD4/b;)V
    .locals 2

    .line 1
    new-instance v0, Lu4/d;

    invoke-virtual {p1}, LY3/f;->m()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lu4/d;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p1, p2}, Lu4/g;-><init>(Lcom/google/android/gms/common/api/GoogleApi;LY3/f;LD4/b;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/GoogleApi;LY3/f;LD4/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lt4/b;-><init>()V

    iput-object p1, p0, Lu4/g;->a:Lcom/google/android/gms/common/api/GoogleApi;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY3/f;

    iput-object p1, p0, Lu4/g;->c:LY3/f;

    iput-object p3, p0, Lu4/g;->b:LD4/b;

    invoke-interface {p3}, LD4/b;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "FDL"

    const-string p2, "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static f(Landroid/os/Bundle;)Landroid/net/Uri;
    .locals 4

    .line 1
    invoke-static {p0}, Lu4/g;->j(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "dynamicLink"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/net/Uri;

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    new-instance v0, Landroid/net/Uri$Builder;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v1, "domainUriPrefix"

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 54
    .line 55
    .line 56
    const-string v1, "parameters"

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eqz p0, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    if-eqz v3, :cond_0

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v0, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :cond_2
    return-object v0
.end method

.method public static j(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "dynamicLink"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/net/Uri;

    .line 8
    .line 9
    const-string v1, "domainUriPrefix"

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string v0, "FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain()."

    .line 27
    .line 28
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a()Lt4/a$c;
    .locals 1

    .line 1
    new-instance v0, Lt4/a$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lt4/a$c;-><init>(Lu4/g;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public b(Landroid/content/Intent;)Lz3/l;
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Lu4/g;->a:Lcom/google/android/gms/common/api/GoogleApi;

    .line 10
    .line 11
    new-instance v2, Lu4/g$e;

    .line 12
    .line 13
    iget-object v3, p0, Lu4/g;->b:LD4/b;

    .line 14
    .line 15
    invoke-direct {v2, v3, v0}, Lu4/g$e;-><init>(LD4/b;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/GoogleApi;->doWrite(Lcom/google/android/gms/common/api/internal/TaskApiCall;)Lz3/l;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lu4/g;->i(Landroid/content/Intent;)Lt4/c;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-static {p1}, Lz3/o;->f(Ljava/lang/Object;)Lz3/l;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    return-object v0
.end method

.method public c(Landroid/net/Uri;)Lz3/l;
    .locals 3

    .line 1
    iget-object v0, p0, Lu4/g;->a:Lcom/google/android/gms/common/api/GoogleApi;

    .line 2
    .line 3
    new-instance v1, Lu4/g$e;

    .line 4
    .line 5
    iget-object v2, p0, Lu4/g;->b:LD4/b;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v1, v2, p1}, Lu4/g$e;-><init>(LD4/b;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApi;->doWrite(Lcom/google/android/gms/common/api/internal/TaskApiCall;)Lz3/l;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public g(Landroid/os/Bundle;)Lz3/l;
    .locals 2

    .line 1
    invoke-static {p1}, Lu4/g;->j(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu4/g;->a:Lcom/google/android/gms/common/api/GoogleApi;

    .line 5
    .line 6
    new-instance v1, Lu4/g$c;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lu4/g$c;-><init>(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApi;->doWrite(Lcom/google/android/gms/common/api/internal/TaskApiCall;)Lz3/l;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public h()LY3/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/g;->c:LY3/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public i(Landroid/content/Intent;)Lt4/c;
    .locals 2

    .line 1
    const-string v0, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA"

    .line 2
    .line 3
    sget-object v1, Lu4/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelableSerializer;->deserializeFromIntentExtra(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu4/a;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v0, Lt4/c;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lt4/c;-><init>(Lu4/a;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    return-object v0
.end method
