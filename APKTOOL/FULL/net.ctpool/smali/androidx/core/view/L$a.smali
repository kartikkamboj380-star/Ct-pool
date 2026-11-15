.class public final Landroidx/core/view/L$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/view/L;->a(Landroid/view/ViewGroup;)LE5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/view/L$a;->a:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/L$a;->a:Landroid/view/ViewGroup;

    invoke-static {v0}, Landroidx/core/view/L;->b(Landroid/view/ViewGroup;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
