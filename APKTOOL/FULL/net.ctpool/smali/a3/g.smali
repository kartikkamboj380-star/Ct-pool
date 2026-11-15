.class public final La3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW2/b;


# instance fields
.field private final a:Ljavax/inject/Provider;


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La3/g;->a:Ljavax/inject/Provider;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Le3/a;)Lb3/f;
    .locals 0

    .line 1
    invoke-static {p0}, La3/f;->a(Le3/a;)Lb3/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LW2/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lb3/f;

    .line 10
    .line 11
    return-object p0
.end method

.method public static b(Ljavax/inject/Provider;)La3/g;
    .locals 1

    .line 1
    new-instance v0, La3/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, La3/g;-><init>(Ljavax/inject/Provider;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public c()Lb3/f;
    .locals 1

    .line 1
    iget-object v0, p0, La3/g;->a:Ljavax/inject/Provider;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Le3/a;

    .line 8
    .line 9
    invoke-static {v0}, La3/g;->a(Le3/a;)Lb3/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, La3/g;->c()Lb3/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
