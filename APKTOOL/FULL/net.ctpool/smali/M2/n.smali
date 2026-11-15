.class public abstract LM2/n;
.super Landroid/text/style/ReplacementSpan;
.source "SourceFile"

# interfaces
.implements LM2/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM2/n$a;
    }
.end annotation


# static fields
.field public static final m:LM2/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LM2/n$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LM2/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LM2/n;->m:LM2/n$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final g(Landroid/text/Spannable;Landroid/widget/TextView;)V
    .locals 1

    .line 1
    sget-object v0, LM2/n;->m:LM2/n$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, LM2/n$a;->a(Landroid/text/Spannable;Landroid/widget/TextView;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract a()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract b()I
.end method

.method public abstract c()V
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public abstract h(Landroid/widget/TextView;)V
.end method
