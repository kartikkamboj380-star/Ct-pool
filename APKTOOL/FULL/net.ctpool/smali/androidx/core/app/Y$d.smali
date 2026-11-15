.class public final Landroidx/core/app/Y$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/Y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/Set;

.field private final c:Landroid/os/Bundle;

.field private d:Ljava/lang/CharSequence;

.field private e:[Ljava/lang/CharSequence;

.field private f:Z

.field private g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/core/app/Y$d;->b:Ljava/util/Set;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Landroidx/core/app/Y$d;->c:Landroid/os/Bundle;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/core/app/Y$d;->f:Z

    const/4 v0, 0x0

    iput v0, p0, Landroidx/core/app/Y$d;->g:I

    if-eqz p1, :cond_0

    iput-object p1, p0, Landroidx/core/app/Y$d;->a:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Result key can\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Landroidx/core/app/Y;
    .locals 9

    .line 1
    new-instance v8, Landroidx/core/app/Y;

    iget-object v1, p0, Landroidx/core/app/Y$d;->a:Ljava/lang/String;

    iget-object v2, p0, Landroidx/core/app/Y$d;->d:Ljava/lang/CharSequence;

    iget-object v3, p0, Landroidx/core/app/Y$d;->e:[Ljava/lang/CharSequence;

    iget-boolean v4, p0, Landroidx/core/app/Y$d;->f:Z

    iget v5, p0, Landroidx/core/app/Y$d;->g:I

    iget-object v6, p0, Landroidx/core/app/Y$d;->c:Landroid/os/Bundle;

    iget-object v7, p0, Landroidx/core/app/Y$d;->b:Ljava/util/Set;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Landroidx/core/app/Y;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZILandroid/os/Bundle;Ljava/util/Set;)V

    return-object v8
.end method

.method public b(Z)Landroidx/core/app/Y$d;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/core/app/Y$d;->f:Z

    return-object p0
.end method

.method public c([Ljava/lang/CharSequence;)Landroidx/core/app/Y$d;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/core/app/Y$d;->e:[Ljava/lang/CharSequence;

    return-object p0
.end method

.method public d(I)Landroidx/core/app/Y$d;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/core/app/Y$d;->g:I

    return-object p0
.end method

.method public e(Ljava/lang/CharSequence;)Landroidx/core/app/Y$d;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/core/app/Y$d;->d:Ljava/lang/CharSequence;

    return-object p0
.end method
