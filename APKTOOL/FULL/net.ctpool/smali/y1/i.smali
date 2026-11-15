.class public final synthetic Ly1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO0/m;


# instance fields
.field public final synthetic a:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/i;->a:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/i;->a:Landroid/net/Uri;

    check-cast p1, LI0/d;

    invoke-static {v0, p1}, Ly1/k;->b(Landroid/net/Uri;LI0/d;)Z

    move-result p1

    return p1
.end method
